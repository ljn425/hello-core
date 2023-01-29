package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 는 10% 할인이 적용되어야 한다.")
    void discount() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);


        // when
        int result = discountPolicy.discount(member, 20000);


        //then
        assertThat(result).isEqualTo(2000);

    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지않아야 한다.")
    void vip_x() {
        Member member = new Member(2L, "memberB", Grade.BASIC);

        int result = discountPolicy.discount(member, 10000);

        assertThat(result).isEqualTo(0);

    }
}