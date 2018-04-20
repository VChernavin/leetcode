package my.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem {
	public List<List<String>> findDuplicate(String[] paths) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (String path : paths) {
			String[] values = path.split(" ");
			for (int i = 1; i < values.length; i++) {
				String[] name_cont = values[i].split("\\(");
				name_cont[1] = name_cont[1].replace(")", "");
				List<String> list = map.getOrDefault(name_cont[1], new ArrayList<String>());
				list.add(values[0] + "/" + name_cont[0]);
				map.put(name_cont[1], list);
			}
		}
		List<List<String>> res = new ArrayList<>();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			List<String> value = entry.getValue();
			if (value.size() > 1) {
				res.add(value);
			}
		}
		return res;
	}
}
