package com.demo.lamada;

import java.io.File;
import java.io.FileFilter;
import java.util.stream.Stream;

public class ListFileDemo {

	public static void main(String[] args) {
		jdk8();
	}

	public static void jdk8() {
		Stream.of(new File(".").listFiles(File::isHidden)).forEach(System.out::println);
	}

	public static void jdk7() {
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isHidden();
			}
		});
		for (File file : hiddenFiles) {
			System.out.println(file);
		}
	}
}
