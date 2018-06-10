package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class ChildrensCircle {

      private int teachers;
      private int ageOfChildren;
      private int boys;
      private int girls;
      private int balls;
      public static int numberOfChildren;

    @Override
    public String toString() {
        String name = "In the Children`s circle there are " + boys + " boys and " + girls + " girls " + ageOfChildren + " age of children. " +
                "There are teachers " + teachers + " and balls " + balls;
        return name;
    }

    public static void printStaticSum(){
        System.out.println("Total number of kids " + numberOfChildren);
    }

    public void printSum(){
        System.out.println("Total number of children " + (girls + boys));
    }

    public void resetValues(int teachers, int ageOfChildren, int boys, int girls, int balls ){
        this.teachers = teachers;
        this.ageOfChildren = ageOfChildren;
        this.boys = boys;
        this.girls = girls;
        this.balls = balls;

        setNumberOfChildren(boys + girls);
    }



    public ChildrensCircle () {
           teachers = 3;
           ageOfChildren = 9;
           boys = 14;
           girls = 15;
           balls = 6;

           setNumberOfChildren(boys + girls);

       }

        public ChildrensCircle(int teachers, int ageOfChildren, int boys, int girls){
          this.teachers = teachers;
          this.ageOfChildren = ageOfChildren;
          this.boys =  boys;
          this.girls = girls;
          balls = 0;

            setNumberOfChildren(boys+girls);
        }

        public  ChildrensCircle(int teachers, int ageOfChildren, int boys, int girls, int balls ){
          this.teachers = teachers;
          this.ageOfChildren = ageOfChildren;
          this.boys = boys;
          this.girls = girls;
          this.balls = balls;

            setNumberOfChildren(boys+girls);
        }


    public static void setNumberOfChildren(int numberOfChildren) {
        ChildrensCircle.numberOfChildren = numberOfChildren;
    }

    public static int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setageOfChildren(int ageOfChildren) {
        this.ageOfChildren = ageOfChildren;
    }

    public int getageOfChildren() {
        return ageOfChildren;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getBalls() {
        return balls;
    }

    public void setBoys(int boys) {
        this.boys = boys;
    }

    public int getBoys() {
        return boys;
    }

    public void setGirls(int girls) {
        this.girls = girls;
    }

    public int getGirls() {
        return girls;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public int getTeachers() {
        return teachers;
    }
}

