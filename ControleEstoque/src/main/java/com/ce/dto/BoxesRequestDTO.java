package com.ce.dto;

import com.ce.model.Boxes;

public class BoxesRequestDTO extends Boxes{

	public BoxesRequestDTO() {
	}

	public BoxesRequestDTO(Long id, String cdBox, Integer idArmazem) {
		setId(id);
		setCdBox(cdBox);
		setIdArmazem(idArmazem);
	}

	public BoxesRequestDTO(Boxes boxes) {
		setId(boxes.getId());
		setCdBox(boxes.getCdBox());
		setIdArmazem(boxes.getIdArmazem());
	}
}
//2023-01-28 00:01:50