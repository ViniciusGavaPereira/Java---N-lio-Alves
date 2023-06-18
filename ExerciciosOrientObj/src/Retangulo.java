public class Retangulo {
    
    double width;
    double height;
    
    public Retangulo() {
    }

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Retangulo [width=" + width + ", height=" + height + "]";
    }
  
    public double area(){
        double resposta = width * height;
        return resposta;
    }

    public double perimeter(){
        double resposta = 2 * (width + height);
        return resposta;
    }

    public double diagonal(){
        double resposta = Math.sqrt(width * width + height * height);
        return resposta;
    }

}
