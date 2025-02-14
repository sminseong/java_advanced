package day09.tree.treeset;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //TreeSet 컬렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(89);

        for (Integer score : scores) System.out.println(score + "점");

        //검색
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 기준 바로 아래: " + scores.lower(95));
        System.out.println("95점 기준 바로 위: " + scores.higher(95));
        System.out.println("85점 이하 중 가장 큰 수: " + scores.floor(85));
        System.out.println("85점 이상 중 가장 작은 수: " + scores.ceiling(85));
        System.out.println("-----------------");
        //내림 차순 정렬
        NavigableSet<Integer> descScores = scores.descendingSet();
        for (Integer s : descScores) System.out.println(s + "점");
        System.out.println("-----------------");

        //점수기준 범위 검색 (80 <=)
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for (Integer s : rangeSet) System.out.println(s + "점");
        System.out.println("-----------------");

        //범위 검색 (80 <= score < 90)
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) System.out.println(s + "점");
        System.out.println("-----------------");
    }
}
