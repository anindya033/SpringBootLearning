package com.dream.wave.party;


import org.springframework.data.jpa.repository.JpaRepository;


	public interface PartyRepository extends JpaRepository<TblParty, Long> {
		public TblParty findByPtyId(Long id);
	}
