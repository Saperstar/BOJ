import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		int san, jung, choi, range;
		double sum = 0;
		int N = Integer.parseInt(br.readLine());
		if(N == 1) {
			N = Integer.parseInt(br.readLine());
			bw.write(N + "\n" + N + "\n" + N + "\n" + "0");
			bw.flush();
			return;
		}
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		Arrays.sort(nums);
		int count = 0, max = 0;
		for(int i = 0; i < N; i++) {
			count = map.getOrDefault(nums[i], 0) + 1;
			map.put(nums[i], count);
			if(count > max) {
				max = count;
			}
		}
		
		for(int i : nums) {
			if(map.get(i) == max) {
				set.add(i);
			}
		}
		List<Integer> list = new ArrayList<>(set);
		list.sort(null);
		san = (int)Math.round(sum / N);
		jung = nums[(N-1) / 2];
		choi = (list.size() > 1 ? list.get(1) : list.get(0));
		range = nums[N-1] - nums[0];
		bw.write(san + "\n");
		bw.write(jung + "\n");
		bw.write(choi + "\n");
		bw.write(range + "\n");
		bw.flush();

	}

}
