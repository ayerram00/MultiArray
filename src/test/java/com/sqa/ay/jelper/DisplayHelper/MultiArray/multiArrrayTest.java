
package com.sqa.ay.jelper.DisplayHelper.MultiArray;

import org.junit.*;

public class multiArrrayTest {

	@Test
	public void test() {

		int i, j;
		Object[][] arrayData = MultiArray.getData();

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(" " + arrayData[i][j]);
			}
		}

	}

}
