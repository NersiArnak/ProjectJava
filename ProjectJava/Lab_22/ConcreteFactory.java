package Lab_22;

// Реализация ComplexAbstractFactory (ConcreteFactory)
public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new ComplexNumber(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}