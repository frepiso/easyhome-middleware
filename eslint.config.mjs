import { defineConfig, globalIgnores } from "eslint/config";
import js from "@eslint/js";
import globals from "globals";
import json from "@eslint/json";
import markdown from "@eslint/markdown";

export default defineConfig([
  { files: ["**/*.{js,mjs,cjs}"], plugins: { js }, extends: ["js/recommended"] },
  { files: ["**/*.js"], languageOptions: { sourceType: "script" } },
  { files: ["**/*.{js,mjs,cjs}"], languageOptions: { globals: globals.node } },
  { files: ["**/*.json"], plugins: { json }, language: "json/json", extends: ["json/recommended"] },
  { files: ["**/*.md"], plugins: { markdown }, language: "markdown/gfm", extends: ["markdown/recommended"] },
  globalIgnores(["package-lock.json", "node_modules/*", "build/**/*",]),
]);