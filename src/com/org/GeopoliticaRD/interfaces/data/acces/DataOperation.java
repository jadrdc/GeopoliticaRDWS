package com.org.GeopoliticaRD.interfaces.data.acces;

import java.util.List;

public interface DataOperation<E> {
	E [] find();

	E findOne(long id);

	void delete(long id);

	void update(E p);
	}
