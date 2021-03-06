package Model;

import androidx.annotation.NonNull;

public class Photos {
    private String photo_reference;
    private String height;
    private String[] html_attributes;
    private String width;
    public String getPhoto_reference(){
        return photo_reference;
    }
    public void setPhoto_reference(String photo_reference){
        this.photo_reference=photo_reference;
    }
    public String getHeight(){
        return height;
    }
    public void setHeight(String height){
        this.height=height;
    }
    public String[] getHtml_attributes(){
        return html_attributes;
    }
    public void setHtml_attributes(String[] html_attributes){
        this.html_attributes=html_attributes;
    }
    public String getWidth(){
        return width;
    }
    public void setWidth(String width){
        this.width=width;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [photo_reference= "+photo_reference+", height="+height+", html_attributes="+html_attributes+", width="+width+"]";
    }
}
