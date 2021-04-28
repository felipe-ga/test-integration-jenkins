package com.guros.mutation;

import com.guros.mutation.persistence.interfacerepository.Mutable;
import com.guros.mutation.persistence.MutableImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MutationApplicationTests {
	private Mutable mutable;

	@Before
	public void init(){
		mutable = new MutableImpl();
	}

	@Test
	public void hasMutationHorizontal() {
		assertEquals(true, mutable.hasMutable(new String[]{"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA","TCACTG"}));
		assertEquals(true, mutable.hasMutable(new String[]{"ATGCGA", "CAGTGC", "ATATGT", "AGAAGG", "ACCATA","ACACTG"}));
	}

	@Test
	public void hasNotMutationVertical() {
		assertEquals(false, mutable.hasMutable(new String[] {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCBTA","TCACTG"}));
	}

	@Test
	public void hasMutationOblicuo() {
		assertEquals(true, mutable.hasMutable(new String[]{"AAGCGA", "AAGTGC", "TTATGT", "AGAAGG", "CCCBTA","TCACTG"}));
		assertEquals(false, mutable.hasMutable(new String[]{"CAGCGA", "AAGTGC", "TTATGT", "AGAAGG", "BCCBTA","CCACTG"}));
		assertEquals(true, mutable.hasMutable(new String[]{"CAGCGA", "AAGTGC", "TTATGT", "AGAAGG", "CCCBTT","TCACTT"}));
		assertEquals(false, mutable.hasMutable(new String[]{"CAGCGA", "AAGTGC", "TTATGT", "AGAAGG", "CCCBTT","TCACTC"}));
	}
}
