class Chick implements Animal {     
    private String myType, mySound;
    public Chick(String type, String sound) {
      myType = "chick";
      mySound = "cluck!";
    }
    public String getSound() {
      return mySound;
    }
    public String getType() {
      return myType;
    }
}
