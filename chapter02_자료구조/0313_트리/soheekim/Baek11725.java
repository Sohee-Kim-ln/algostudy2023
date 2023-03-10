package study0313;

import java.util.ArrayList;
import java.util.Scanner;

public class Baek11725 {

	static bNode[] tree;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		StringBuilder sb = new StringBuilder();
		// 트리 선언
		tree = new bNode[N + 1];

		// 선언된 트리에 노드 넣기
		for (int i = 0; i < N + 1; i++) {
			tree[i] = new bNode();
		}

		// 간선정보 저장
		for (int line = 0; line < N - 1; line++) {
			String[] tempS = sc.nextLine().split(" ");
			int nodeA = Integer.parseInt(tempS[0]);
			int nodeB = Integer.parseInt(tempS[1]);
			tree[nodeA].linked.add(nodeB);
			tree[nodeB].linked.add(nodeA);
		}

		// BFS로 탐색하면서 부모 입력해주기
		calDepth(1);

		//2번 노드부터 끝 노드까지의 부모를 sb에 입력
		for (int i = 2; i < tree.length; i++) {
			sb.append(tree[i].parent).append("\n");
		}

		//출력
		System.out.println(sb);
		sc.close();
	}

	// 부모 입력하는 메서드
	static void calDepth(int num) {
		// 루트노드인 1이면
		if (num == 1)
			tree[num].parent = 0;

		// [num] 노드가 가지고 있는 자식들에 대해
		for (int i = 0; i < tree[num].linked.size(); i++) {
			// i번째 자식의 부모가 0이라면 (갱신된 적 없다면)
			if (tree[tree[num].linked.get(i)].parent == 0) {
				//i번째 자식의 부모를 num으로 갱신
				tree[tree[num].linked.get(i)].parent = num;
				//i번째 자식의 자식들에 대해 부모입력 실시
				calDepth(tree[num].linked.get(i));
			}
		}
	}
}

class bNode {
	int parent;
	ArrayList<Integer> linked;

	bNode() {
		this.parent = 0;
		this.linked = new ArrayList<Integer>();
	}

}