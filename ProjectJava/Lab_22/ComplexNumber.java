package Lab_22;
// Реализация интерфейса Complex
public class ComplexNumber implements Complex {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public int getReal() {
        return real;
    }

    @Override
    public int getImaginary() {
        return imaginary;
    }

    @Override
    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
}
