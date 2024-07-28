/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem4;

/**
 *
 * @author samar
 */
public class PhotoBookTest {
    public static void main(String[] args) {
        PhotoBook b1=new PhotoBook();
        System.out.println(b1.GetNumberPages());
        PhotoBook b2=new PhotoBook(24);
        System.out.println(b2.GetNumberPages());
        BigPhotoBook bb=new BigPhotoBook();
        System.out.println(bb.GetNumberPages());
    }
    
}
