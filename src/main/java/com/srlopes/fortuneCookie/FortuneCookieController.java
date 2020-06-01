package com.srlopes.fortuneCookie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@RestController
public class FortuneCookieController {

        final private List<String> frases = Arrays.asList(
                "Thousands of candles can be lighted from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared. - Buddha",
                "There are more things to alarm us than to harm us, and we suffer more often in apprehension than reality. - Seneca",
                "Time you enjoy wasting is not wasted time - Time you enjoy wasting is not wasted time - Marthe Troly-Curtin",
                "When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us. - Helen Keller",
                "Life is not measured by the number of breaths we take, but by the moments that take our breath away. - Maya Angelou ",
                "The pleasure which we most rarely experience gives us greatest delight. - Epictetus",
                "Do not spoil what you have by desiring what you have not; remember that what you now have was once among the things you only hoped for. - Epicurus",
                "Just because it didn’t last forever, doesn’t mean it wasn’t worth your while. - Unknown"
        );

        @GetMapping("/")
        public String indexRoute() {
                int indice = ThreadLocalRandom.current().nextInt(frases.size());
                return frases.get(indice);
        }
}
