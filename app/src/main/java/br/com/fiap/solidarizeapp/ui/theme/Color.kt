package br.com.fiap.solidarizeapp.ui.theme

import androidx.compose.ui.graphics.Color

// Cores da paleta do usuário (extraídas da imagem de referência)
val BackgroundStart = Color(0xFFEFF1FA) // Azul claro muito sutil do topo
val BackgroundEnd = Color(0xFFE4E8F5)   // Azul claro sutil da base
val CardBackground = Color(0xFFE8EBF7)  // Fundo do card (azul acinzentado claro)
val GreenDark = Color(0xFF1B4332)      // Verde escuro do botão "Entrar" (início do degradê)
val GreenLight = Color(0xFF52B788)     // Verde claro do botão "Entrar" (fim do degradê)
val GreenAccent = Color(0xFF2D6A4F)    // Verde dos links e ícone de biometria
val TextPrimary = Color(0xFF1C1C2E)    // Texto principal (quase preto)
val TextSecondary = Color(0xFF555555)  // Texto secundário (cinza médio)
val TextHint = Color(0xFFBBBBBB)       // Texto de placeholder (cinza claro)
val DividerColor = Color(0xFFCCCCCC)   // Cor das linhas divisórias
val SocialBorder = Color(0xFFE0E0E0)   // Borda dos botões sociais
val White = Color(0xFFFFFFFF)          // Branco puro

// Mapeamento para o Tema Claro (LightColorScheme) - priorizando as cores da imagem
val LightPrimary = GreenDark // Usado para o início do degradê principal
val LightSecondary = GreenAccent // Usado para links e ícones de destaque
val LightTertiary = GreenLight // Usado para o fim do degradê principal
val LightBackground = BackgroundStart // Cor de fundo principal
val LightSurface = CardBackground // Cor de superfície (cards, etc.)
val LightOnPrimary = White // Texto sobre o verde escuro
val LightOnSecondary = White // Texto sobre o verde de destaque
val LightOnTertiary = White // Texto sobre o verde claro
val LightOnBackground = TextPrimary // Texto sobre o fundo
val LightOnSurface = TextPrimary // Texto sobre a superfície

// Mapeamento para o Tema Escuro (DarkColorScheme) - adaptando as cores da imagem
val DarkPrimary = GreenLight // Início do degradê no dark theme
val DarkSecondary = GreenAccent // Links e ícones de destaque no dark theme
val DarkTertiary = GreenDark // Fim do degradê no dark theme
val DarkBackground = Color(0xFF121212) // Fundo escuro
val DarkSurface = Color(0xFF1E1E1E) // Superfície escura
val DarkOnPrimary = White // Texto sobre o verde claro
val DarkOnSecondary = White // Texto sobre o verde de destaque
val DarkOnTertiary = White // Texto sobre o verde escuro
val DarkOnBackground = White // Texto sobre o fundo escuro
val DarkOnSurface = White // Texto sobre a superfície escura
