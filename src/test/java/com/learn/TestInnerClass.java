package com.learn;

/**
 * @program: algorithms
 * @description:
 * @author: zjj
 * @create: 2019-11-12 14:09
 **/
public class TestInnerClass {
    private String test1;

    private String test2;

    public TestInnerClass(String test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "TestInnerClass{" +
                "test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                '}';
    }

    public static class Inner{
        private Integer age;
        private String name;
        private String addr;

        public Inner(Integer age) {
            this.age = age;
        }

        public Inner(Integer age, String name) {
            this.age =age;
            this.name = name;
        }

        public Inner(Integer age, String name, String addr) {
            this.age = age;
            this.name = name;
            this.addr = addr;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", addr='" + addr + '\'' +
                    '}';
        }
    }
}
