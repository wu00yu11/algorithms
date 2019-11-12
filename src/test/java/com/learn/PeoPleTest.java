package com.learn;


import org.junit.Test;

public class PeoPleTest {
    @Test
    public void peopleBuildTest(){
        PeoPle.Build build =  new PeoPle.Build();
        build.setName("lili");
        build.setAddr("昌盛路");
        build.setAge(18);
        try {
            PeoPle peoPle = build.build();
            System.out.println(peoPle.toString());
            peoPle.setAge(19);
            System.out.println(peoPle.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
