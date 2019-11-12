package com.learn;

/**
 * @program: algorithms
 * @description: 人员信息构建类
 * @author: zjj
 * @create: 2019-11-12 14:33
 **/
public class PeoPle {
    private String name;
    private Integer age;
    private String addr;

    private PeoPle() {
    }

    private PeoPle(String name, Integer age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }

    @Override
    public String toString() {
        return "PeoPleBuild{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    static class Build{
        private String name;
        private Integer age;
        private String addr;

        public Build setName(String name) {
            this.name = name;
            return this;
        }

        public Build setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Build setAddr(String addr) {
            this.addr = addr;
            return this;
        }

        public PeoPle build() throws Exception {
            if (name == null){
                throw new Exception("name is null");
            }
            if (age == null){
                throw new Exception("age is null");
            }
            if (addr == null){
                throw new Exception("addr is null");
            }
            return new PeoPle(name,age,addr);
        }
    }
}
