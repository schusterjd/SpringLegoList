/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.LegoSets;

public interface LegoRepository extends JpaRepository<LegoSets, String> {

}
