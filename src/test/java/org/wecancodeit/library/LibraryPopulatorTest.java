package org.wecancodeit.library;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class LibraryPopulatorTest {
	
	@Autowired
	GenreRepository repo;
	
	@Test
	public void populatorShouldSaveAndLoadGenre() {
		Genre testGenre = repo.save(new Genre("test"));
		Genre underTest = repo.findOne(1L);
		assertThat(underTest, is(equalTo(testGenre)));
	}
}
