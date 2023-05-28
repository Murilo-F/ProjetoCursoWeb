package com.ce.dto;

import com.ce.model.Materiais;

public class MateriaisRequestDTO extends Materiais{

	public MateriaisRequestDTO() {
	}

	public MateriaisRequestDTO(Long id, String nmMaterial, Integer stMaterial, Double vlCompra, Double qtMinima, Integer idUnimed) {
		setId(id);
		setNmMaterial(nmMaterial);
		setStMaterial(stMaterial);
		setVlCompra(vlCompra);
		setQtMinima(qtMinima);
		setIdUnimed(idUnimed);
	}

	public MateriaisRequestDTO(Materiais materiais) {
		setId(materiais.getId());
		setNmMaterial(materiais.getNmMaterial());
		setStMaterial(materiais.getStMaterial());
		setVlCompra(materiais.getVlCompra());
		setQtMinima(materiais.getQtMinima());
		setIdUnimed(materiais.getIdUnimed());
	}
}
//2023-01-28 00:01:50