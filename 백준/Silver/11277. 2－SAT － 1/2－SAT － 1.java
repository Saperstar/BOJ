import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static List<List<Integer>> graph;
    static List<List<Integer>> revGraph;
    static boolean[] visited;
    static Stack<Integer> stack;
    static int[] sccId;
    static int sccCount;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        graph = new ArrayList<>();
        revGraph = new ArrayList<>();
        stack = new Stack<>();
        sccCount = 0;
		
		int fir;
		int sec;
		int varCount = sc.nextInt();  // 진짜 변수 개수 (x1 ~ x_varCount)
		n = varCount + 2;             // 내부적으로 쓸 n은 varCount + 2
		for (int t = 0; t < 2 * n; t++) {
		    graph.add(new ArrayList<>()); 		// 각 정점에 연결된 간선 리스트 초기화
		    revGraph.add(new ArrayList<>());	// 역방향 그래프 리스트 초기화
		}
		int m = sc.nextInt();			//절의 개수
		for(int k = 0; k < m; k++) {
			int firinput = sc.nextInt();		//절의 첫번째 변수
			int secinput = sc.nextInt();		//절의 두번째 변수
			fir = toIndex(firinput);
			sec = toIndex(secinput);
			
			graph.get(fir ^ 1).add(sec);
			graph.get(sec ^ 1).add(fir);		//방향 노드를 생성
			revGraph.get(sec).add(fir ^ 1);
			revGraph.get(fir).add(sec ^ 1);		//역방향 노드를 생성
		
		}
		
		visited = new boolean[n * 2];
        sccId = new int[n * 2];

        // 1단계: 정방향 DFS → 탐색 종료 순서 스택 저장
        for (int i = 2; i < n * 2; i++) {
            if (!visited[i]) dfs(i);
        }

        // 2단계: 역방향 DFS → SCC 번호 부여
        Arrays.fill(visited, false);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) reverseDFS(node, sccCount++);
        }

        // 3단계: 모순 검사
        for (int i = 1; i <= varCount; i++) {
            if (sccId[2 * i] == sccId[2 * i + 1]) {
                System.out.println(0); // 불가능
                return;
            }
        }
        

        // 출력
        System.out.println(1);
        
        sc.close();
    }

    // 정점 번호 변환 함수
    //x가 양수일 때, 2x & x가 음수일 때, |x| * 2 + 1 리턴
    static int toIndex(int x) {
        return x >= 0 ? x * 2 : Math.abs(x) * 2 + 1;
    }

    // 정방향 DFS
    static void dfs(int u) {
        visited[u] = true;
        for (int v : graph.get(u)) {
            if (!visited[v]) dfs(v);
        }
        stack.push(u);
    }

    // 역방향 DFS
    static void reverseDFS(int u, int label) {
        visited[u] = true;
        sccId[u] = label;
        for (int v : revGraph.get(u)) {
            if (!visited[v]) reverseDFS(v, label);
        }
	}
}
