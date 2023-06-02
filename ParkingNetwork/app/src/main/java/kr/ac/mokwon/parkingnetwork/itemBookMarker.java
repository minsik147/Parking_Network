package kr.ac.mokwon.parkingnetwork;

import android.widget.ImageView;

public class itemBookMarker
{
    private ImageView image;
    private String name;
    private String address;

    public itemBookMarker()
    {

    }

    public itemBookMarker(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public ImageView getImage()
    {
        return image;
    }

    public void setImage(ImageView image)
    {
        this.image = image;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
