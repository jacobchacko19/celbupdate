class Celebrity {
private String name;
private int weight;
private int age;
private String occupation;
private String race;
private String gender;
    public Celebrity(String name, String occupation, String race, int weight, String gender,int age){
this.name = name;
this.occupation = occupation;
this.race = race;
this.weight =weight;
this.gender =gender;
this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public String getOccupation() {
        return this.occupation;
    }
    public String getRace(){
        return this.race;
    }
    public int getWeight() {
        return this.weight;
    }
    public String getGender() {
        return this.gender;
    }
    public int getAge() {
        return this.age;
    }
}
