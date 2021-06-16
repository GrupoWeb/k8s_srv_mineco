package com.egoveris.te.base.util;

import java.util.ArrayList;
import java.util.List;

public abstract class ListUtil {

	public static <T> List<List<T>> partition(List<T> list, final int L) {
		List<List<T>> parts = new ArrayList<List<T>>();
		final int N = list.size();
		for (int i = 0; i < N; i += L) {
			parts.add(new ArrayList<T>(list.subList(i, Math.min(N, i + L))));
		}
		return parts;
	}

}
