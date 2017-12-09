/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ChauMeng
 */
public interface MenuInterface {
    public void setFoodname(String foodname);
    public void setFoodprice(double foodprice);
    public String getFoodname();
    public double getFoodprice();
}
