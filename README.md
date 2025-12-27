# Java HGS Simulation

Bu proje, Java kullanılarak HGS (Hızlı Geçiş Sistemi) geçiş ücretlerinin
nesne yönelimli programlama (OOP) prensipleriyle simülasyonunu
gerçekleştirmektedir.

## Proje Amacı
Farklı araç türleri için geçiş ücretlerinin hesaplanmasını,
kalıtım (inheritance), metot ezme (override) ve exception handling
kavramlarını kullanarak modellemek.

## Kullanılan Yapılar
- Inheritance (Arac → Otomobil, Kamyonet)
- Method Overriding
- Exception Handling
- Polymorphism
- Encapsulation

## Sınıflar
- **Arac**: Ortak özellikleri ve temel geçiş ücreti hesaplamasını içerir
- **Otomobil**: Otomatik ödeme talimatı varsa indirim uygular
- **Kamyonet**: Ticari araçlar için ek ücret uygular
- **HGSTest**: Test senaryolarını ve örnek çıktıları içerir

## İş Kuralları
- Geçersiz km bilgisi girilirse hata fırlatılır
- HGS etiketi olmayan araçlardan 3 katı ücret alınır
- Otomatik ödeme talimatı olan otomobillere %5 indirim uygulanır
- Ticari kamyonetlere %15 ek ücret uygulanır

## Çalıştırma
Tüm sınıflar aynı dizinde olacak şekilde:

```bash
javac *.java
java HGSTest
