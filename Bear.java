public abstract class Bear {

  public void roar(){
    System.out.println("hey grabbar");
  }

  public abstract void gatherFood();

  public void wakeUp(){
  System.out.println("waking up");
}

  public void eat(){
    System.out.println("eating");
  }

  public void sleeping(){
    System.out.println("sleeping");
  }

  public void typicalDay(){
    wakeUp();
    gatherFood();
    eat();
    sleeping();
  }
}