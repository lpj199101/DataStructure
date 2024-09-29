package com.atguigu.sparsearray_01;

public class SparseArray {

	public static void main(String[] args) {

		/**����һ��ԭʼ�Ķ�ά���� 11 * 11*/
		// 0: ��ʾû�����ӣ� 1 ��ʾ���� 2 ������
		int chessArr1[][] = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		chessArr1[4][5] = 2;
		// ���ԭʼ�Ķ�ά����
		System.out.println("ԭʼ�Ķ�ά���飺");
		for (int[] row : chessArr1) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}


		/**����ά���� ת ϡ�������˼·*/
		// 1. ����ԭʼ�Ķ�ά���飬�õ���Ч���ݵĸ��� sum
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArr1[i][j] != 0) {
					sum++;
				}
			}
		}
		//2. ����sum �Ϳ��Դ���ϡ������sparseArr int[sum + 1] [3]
		//int[sum + 1] [3] ->
		//  sum+1ϡ�������������1Ϊ��1�������С��С�����  [3]Ϊ����
		int sparseArr[][] = new int[sum + 1][3];
		//3. ����ά�������Ч�������ݴ��뵽ϡ������
		//ϡ������ĵ�һ�У��С��С�����
		sparseArr[0][0] = 11;
		sparseArr[0][1] = 11;
		sparseArr[0][2] = sum;
		//������ά���飬����0��ֵ��ŵ� sparseArr��
		//count ���ڼ�¼�ǵڼ�����0����,����ϡ������ĵ�count��
		int count = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArr1[i][j] != 0) {
					count++;
					sparseArr[count][0] = i;//��ֵ
					sparseArr[count][1] = j;//��ֵ
					sparseArr[count][2] = chessArr1[i][j];//ֵ
				}
			}
		}
		// ���ϡ���������ʽ
		System.out.println();
		System.out.println("�õ�ϡ������Ϊ��");
		for (int i = 0; i < sparseArr.length; i++) {
			System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
		}
		System.out.println();


		/**��ϡ������ --�� �ָ��� ԭʼ�Ķ�ά����*/
		//1. �ȶ�ȡϡ������ĵ�һ�У����ݵ�һ�е����ݣ�����ԭʼ�Ķ�ά���飬
		//    ���������  chessArr2 = int [11][11]
		int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
		
		//2. �ڶ�ȡϡ��������е�����(�ӵڶ��п�ʼ)�������� ԭʼ�Ķ�ά���� ����
		for(int i = 1; i < sparseArr.length; i++) {
			chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
		}
		
		// ����ָ���Ķ�ά����
		System.out.println();
		System.out.println("�ָ���Ķ�ά���飺");
		for (int[] row : chessArr2) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}

}
