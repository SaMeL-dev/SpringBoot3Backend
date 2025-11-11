package me.seungjun.springboot3backend.service;

import lombok.RequiredArgsConstructor;
import me.seungjun.springboot3backend.domain.RefreshToken;
import me.seungjun.springboot3backend.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken).orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
