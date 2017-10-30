package net.terzeron.spring.observer;

public interface Subject {
  public void addListener(Observer o);
  public void removeListener(Observer o);
  public void notifyListeners();
}
