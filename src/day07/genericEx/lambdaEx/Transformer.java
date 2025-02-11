package day07.genericEx.lambdaEx;
// Transformer 제너릭 함수형 인터페이스 정의
@FunctionalInterface
public interface Transformer<T, R> {
    R transform(T input);
}
