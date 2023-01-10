package org.example;
import org.example.basic.Dancer;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.performanceTeam;

public class Main {
    public static void main(String[] args) {

        //new Dancer(); abstract로 막힘,추상적, 공통 속성,기능을 위해 존재, 구체화 시킬일 없음



        Dancer idolDancer1 = new IdolDancer("아이돌팀1","아이돌1");
        Dancer idolDancer2= new IdolDancer("아이돌팀2","아이돌2");
        Dancer idolDancer3 = new IdolDancer("아이돌팀3","아이돌3");

        Dancer streetDancer1 = new StreetDancer("스팀1","스댄1");
        Dancer streetDancer2 = new StreetDancer("스팀2","스댄2");
        Dancer streetDancer3 = new StreetDancer("스팀3","스댄3");

        performanceTeam team = new performanceTeam();

        team.joinDancer(idolDancer1);
        team.joinDancer(streetDancer3);
        team.joinDancer(streetDancer2);

        System.out.println();
        team.groupDance();
    }
}