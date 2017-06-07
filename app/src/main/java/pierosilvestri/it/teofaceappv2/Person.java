package pierosilvestri.it.teofaceappv2;

import android.graphics.Bitmap;

/**
 * Created by pierosilvestri on 07/06/17.
 */

public class Person {

    public String Name;
    public String Surname;
    public String Email;
    public Bitmap Img1;
    public Bitmap Img2;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Bitmap getImg1() {
        return Img1;
    }

    public void setImg1(Bitmap img1) {
        Img1 = img1;
    }

    public Bitmap getImg2() {
        return Img2;
    }

    public void setImg2(Bitmap img2) {
        Img2 = img2;
    }

    public Person(){

    }

    public Person(String name, String surname, String email, Bitmap img1, Bitmap img2){
        this.Name = name;
        this.Surname = surname;
        this.Email = email;
        this.Img1 = img1;
        this.Img2 = img2;
    }


}
