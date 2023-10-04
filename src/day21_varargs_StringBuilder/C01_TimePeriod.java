package day21_varargs_StringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C01_TimePeriod {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(2004,4,15);
        LocalDate bugun = LocalDate.now();

        Period yasim = Period.between(dogumTarihi,bugun);

        System.out.println(yasim); // P19Y5M19D

        System.out.println(yasim.getYears()); // 19
    }
}
