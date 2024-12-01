package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ComponentPatternTest extends AbstractTest {
    /*PositiveTest*/
    @ParameterizedTest
    @ValueSource(longs = {100L, 200L, 300L})
    void onePortfolioTest(Long longNum) {
        //given
        Portfolio portfolio = new Portfolio();
        portfolio.add(new Account(longNum));
        portfolio.add(new Account(longNum));
        portfolio.add(new Account(longNum));
        //when
        Long result = portfolio.sum();
        //then
        Assertions.assertEquals(longNum * 3, result);
    }

    @Test
    void complexPortfolioTest() {
        //given
        Portfolio portfolioFirstLevel = new Portfolio();
        Portfolio portfolioNextLevelOne = new Portfolio();
        Portfolio portfolioNextLevelTwo = new Portfolio();

        portfolioFirstLevel.add(portfolioNextLevelOne);
        portfolioFirstLevel.add(portfolioNextLevelTwo);

        portfolioNextLevelOne.add(new Account(100L));
        portfolioNextLevelOne.add(new Account(200L));
        portfolioNextLevelOne.add(new Account(300L));

        portfolioNextLevelTwo.add(new Account(100L));
        portfolioNextLevelTwo.add(new Account(200L));
        portfolioNextLevelTwo.add(new Account(300L));
        //when
        Long result = portfolioFirstLevel.sum();
        //then
        Assertions.assertEquals(1200L, result);
    }

    /*NegativeTest*/
    @ParameterizedTest
    @ValueSource(longs = {100L, 200L, 300L})
    void onePortfolioNegativeTest(Long longNum) {
        //given
        Portfolio portfolio = new Portfolio();
        portfolio.add(new Account(longNum));
        portfolio.add(new Account(longNum));
        portfolio.add(new Account(longNum));
        //when
        Long result = portfolio.sum();
        //then
        Assertions.assertNotEquals((longNum * 3) - 1, result);
    }

    @Test
    void complexPortfolioNegativeTest() {
        //given
        Portfolio portfolioFirstLevel = new Portfolio();
        Portfolio portfolioNextLevelOne = new Portfolio();
        Portfolio portfolioNextLevelTwo = new Portfolio();

        portfolioFirstLevel.add(portfolioNextLevelOne);
        portfolioFirstLevel.add(portfolioNextLevelTwo);

        portfolioNextLevelOne.add(new Account(100L));
        portfolioNextLevelOne.add(new Account(200L));
        portfolioNextLevelOne.add(new Account(300L));

        portfolioNextLevelTwo.add(new Account(100L));
        portfolioNextLevelTwo.add(new Account(200L));
        portfolioNextLevelTwo.add(new Account(300L));
        //when
        Long result = portfolioFirstLevel.sum();
        //then
        Assertions.assertNotEquals(1000L, result);
    }

}
