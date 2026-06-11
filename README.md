# Manejo de Flujos de Eventos en Sistema de Pagos

En un sistema de procesamiento de pagos, múltiples orígenes generan eventos de pago que deben ser gestionados de manera eficiente y resiliente. El sistema debe mantener la resiliencia, escalabilidad y confiabilidad del código al manejar estos flujos de eventos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | programación reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del Sistema

**Objetivo:** Comprender la arquitectura y las restricciones del sistema de pagos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los diferentes orígenes de eventos de pago y sus características.
- Determina las restricciones y ambigüedades presentes en el sistema.

**Entregable:** Documento que describe los orígenes de eventos, sus características y las restricciones identificadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la cardinalidad de los orígenes de eventos.
- Analiza las propiedades operativas del sistema, como latencia y disponibilidad.

</details>

### Fase 2: Manejo de Flujos de Eventos

**Objetivo:** Implementar el manejo de flujos de eventos provenientes de múltiples orígenes.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Diseña una solución para gestionar los flujos de eventos de pago de manera eficiente y resiliente.
- Considera la resiliencia, escalabilidad y confiabilidad del código en tu implementación.

**Entregable:** Solución que gestiona los flujos de eventos de pago de manera eficiente y resiliente.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza operadores de Project Reactor para manejar los flujos de eventos.
- Considera el uso de patrones de diseño para mejorar la resiliencia y escalabilidad.

</details>

### Fase 3: Evaluación y Mejora

**Objetivo:** Evaluar y mejorar la solución implementada.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Realiza una evaluación crítica de la solución implementada.
- Identifica áreas de mejora y propone soluciones para optimizar la resiliencia, escalabilidad y confiabilidad.

**Entregable:** Reporte que evalúa la solución implementada y propone mejoras.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el impacto de las mejoras propuestas en la resiliencia y escalabilidad del sistema.
- Evalúa el uso de patrones de diseño y operadores de Project Reactor en tu solución.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los operadores de Project Reactor y cómo se utilizan para manejar flujos de eventos?
- **paraQueSirve**: ¿Para qué sirve el manejo de flujos de eventos en un sistema de pagos?
- **comoSeUsa**: ¿Cómo se utilizan los patrones de diseño para mejorar la resiliencia y escalabilidad de una solución?
- **erroresComunes**: ¿Cuáles son los errores comunes al manejar flujos de eventos y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una solución para manejar flujos de eventos de manera resiliente y escalable?

## Criterios de Evaluacion

- Identificación correcta de los orígenes de eventos y sus características.
- Implementación eficiente y resiliente del manejo de flujos de eventos.
- Propuesta de mejoras fundamentadas para optimizar la resiliencia y escalabilidad de la solución.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
