/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author odraude
 */
public class Box <T> {
    private T t;

  public T get() { return t; }
  public void set(T t) { this.t = t; }
}
