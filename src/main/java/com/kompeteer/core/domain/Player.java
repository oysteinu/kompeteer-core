package com.kompeteer.core.domain;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

@Getter
public class Player {
	private final String id;

	public Player() {
		this.id = UUID.randomUUID().toString();
	}

	public Player(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Player)) {
			return false;
		}

		Player p2 = (Player) o;

		return StringUtils.equals(id, p2.id);
	}
}
