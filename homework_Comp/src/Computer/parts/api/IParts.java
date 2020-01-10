package Computer.parts.api;

public interface IParts {
    IStandard getParts();
    boolean test(IStandard[] standards);
}
