package com.piaoniu.common;

import java.util.List;

/**
 * @author code4crafter@gmail.com
 *         Date: 17/2/17
 *         Time: 下午5:08
 */
public interface MaxIdPageQuerier<T> {

	List<T> query(int id, int limit);
}
