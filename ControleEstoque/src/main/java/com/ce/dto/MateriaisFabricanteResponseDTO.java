package com.ce.dto;

import com.ce.model.MateriaisFabricante;

public class MateriaisFabricanteResponseDTO extends MateriaisFabricante{

	public MateriaisFabricanteResponseDTO() {
	}

	public MateriaisFabricanteResponseDTO(Long id, Integer idMaterial, Integer idFabricante, String cdEan13) {
		setId(id);
		setIdMaterial(idMaterial);
		setIdFabricante(idFabricante);
		setCdEan13(cdEan13);
	}

	public MateriaisFabricanteResponseDTO(MateriaisFabricante materiaisFabricante) {
		setId(materiaisFabricante.getId());
		setIdMaterial(materiaisFabricante.getIdMaterial());
		setIdFabricante(materiaisFabricante.getIdFabricante());
		setCdEan13(materiaisFabricante.getCdEan13());
	}
}
//2023-01-28 00:01:50