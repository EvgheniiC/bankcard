package com.bankcard.repository;

import com.bankcard.model.Card;
import com.bankcard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    /**
     * findCardByUser - finds all cards fy user and returns list of cards.
     *
     * @param user - user.
     * @return - returns list of cards.
     */
    List<Card> findCardByUser(User user);

    /**
     * findCardByUserAndName - find card by user and card name and returns card.
     *
     * @param user - user.
     * @param name - card name.
     * @return - returns card.
     */
    Card findCardByUserAndName(User user, String name);

}
