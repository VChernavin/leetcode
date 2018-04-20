package my.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class FindDuplicateFileInSystemTest {
	@Test
	public void test1() {
		String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
		List<String> abcdFiles = new ArrayList<>();
		abcdFiles.add("root/a/1.txt");
		abcdFiles.add("root/c/3.txt");
		List<String> efghFiles = new ArrayList<>();
		efghFiles.add("root/a/2.txt");
		efghFiles.add("root/c/d/4.txt");
		efghFiles.add("root/4.txt");
		List<List<String>> expectedResult = new ArrayList<>();
		expectedResult.add(efghFiles);
		expectedResult.add(abcdFiles);
		List<List<String>> actualResult = new FindDuplicateFileInSystem().findDuplicate(paths);
		Assert.assertArrayEquals(expectedResult.get(0).toArray(), actualResult.get(0).toArray());
		Assert.assertArrayEquals(expectedResult.get(1).toArray(), actualResult.get(1).toArray());

	}
}
