package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		// ArrayList ��ü�� �����ϱ����� �迭
		
		list1.add(10); // ArrayList ���� ��ü�ۿ� �����´�
						// 10�� �⺻�������� �˾Ƽ� wrapperŬ�����̿� �ڽ� �� ���������ش� 
		
		list1.add(new Integer(5)); // ��Ȯ���� �̷��� �ڽ�������Ѵ�
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// subList : arrayList���� �Ϻθ� �̾Ƽ� ���ο� �迭�� ����
		ArrayList list2 = new ArrayList(list1.subList(1,4));
												// 1���ε����̻� 4���ε����̸�
		print(list1,list2);
		
		// Collection : �������̽� / Collections : ��ƿ Ŭ����		
		// �������� ����
		Collections.sort(list1);
		Collections.sort(list2);
		
		// reverse() : �迭 ������ �Ųٷ� �������ش�
		// ������������(sort()) �� �������ֱ� -> ��������
		Collections.reverse(list1);
		print(list1, list2);
		
		// contains() : �ش� ��Ұ� ���ԵǾ��ִ���
		// containsAll() : �ش� ��Ұ� ��� ���ԵǾ��ִ��� Ȯ��
		// list2 ������ list1�� ���� ���ԵǾ��ִ���
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		
		// add() : ������ �߰�. ��ġ(�ε���)�� ��������
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // 3���ε����� A�߰�
		print(list1, list2);
		
		// set() : �ش� ��ġ(�ε���)�� �ִ� ������ ����
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		// indexOf() : ������ ��ü�� ��ġ(�ε���)�� �˷���
		System.out.println("index = "+list1.indexOf("1")); //���� 1
		System.out.println("index = "+list1.indexOf(1)); // ���� 1
		print(list1, list2); // ���� ���� �����ؼ� ã���ش�
		
		
		// remove() : �ش� �ε����� ���� ����
		list1.remove(1); // 1�� �ε����� ���� ������ �ȴ�
		list1.remove(new Integer(1)); // ��ü�� �ְԵǸ� �ش簪�� ����1�� �����ȴ�
		print(list1, list2);
		
		// retainAll() : ��ġ�� ���� ����� �������� ��� ����
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1, list2);	// list1�� �� �� list2�� �ߺ����� ����� ������ �����Ѵ�
		
		// get() : �ش� �ε����� ���� �ҷ��´�
		// list2 ���� list1 �� ��ġ�� �κ��� ����
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) // list2�� ���� list1�� ���ԵǾ��ִ���
				list2.remove(i);		
		}
		print(list1, list2);
		
		
		// ��ü������ �ȵȴ�. �����Ҷ����� size�� �پ��⶧��
//		for(int i=0; i<list2.size(); i++) { // �÷��ǿ����� ���̰� length()�� �ƴ϶�
//			list2.remove(i);				// size()�� �ۼ��Ѵ�
//		}
//		// ��ü���� : �������ε������� �����Ѵ�
//		for(int i=list2.size()-1; i>=0; i--) {
//			list2.remove(i);
//		}
//		print(list1, list2);
		
	}
	
	// ����ϱ� ���� �޼���
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
}
