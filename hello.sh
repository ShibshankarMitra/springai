#!/bin/bash
OPENAI_API_KEY="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"
PROMPT="Tell me a joke"

curl "https://api.openai.com/v1/chat/completions" \
    -H "Content-Type: application/json" \
    -H "Authorization: Bearer $OPENAI_API_KEY" \
    -d '{
        "model": "gpt-4o-mini",
        "messages": [
            {
                "role": "system",
                "content": "'"${PROMPT}"'"
            }
        ]
    }'