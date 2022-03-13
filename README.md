# Java Refresher

1. Poprawnie zaimplementowane zadanie powinno przechodzić wszystkie testy uruchomione za pomocą `mvn clean test`
2. Zaimplementuj klasę generyczną `Tuple<T1, T2, T3>`
* klasa ma reprezentować parę elementów dowolnego typu
* klasa po przeciążać metodę `toString` i zwracać swoją tekstową reprezentację w formacie `Tuple<V1, V2>`, gdzie
`VN` to wartość n-tego elementu trójki
* klasa ma mieć możliwość sprawdzania równości pomiędzy różnymi obiektami
* klasa ma mieć metody pobierające kolejne elementy, nazwy metod
to: `getFirst()`, `getSecond()`
* klasa ma mieć możliwość bycia sortowanym, domyślne sortowanie
(Comparable) ma działać następującą dla obiektów `t1` i `t2`:
  * jeżeli `t1.getFirst() < t2.getFirst()` to pierwszy element jest
mniejszy
  * jeżeli `t1.getFirst() > t2.getFirst()` to drugi element jest mniejszy
  * jeżeli `t1.getFirst() == t2.getFIrst()` to
    * jeżeli `t1.getSecond() < t2.getSecond()` to pierwszy element jest mniejszy
    * jeżeli `t1.getSecond() > t2.getSecond()` to drugi element
jest mniejszy
    * jeżeli `t1.getSecond() == t2.getSecond()` to oba elementy są równe