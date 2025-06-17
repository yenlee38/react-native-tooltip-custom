const path = require('path');
const { getDefaultConfig } = require('@react-native/metro-config');

// 👇 Bọc logic trong async function vì import() trả về Promise
module.exports = (async () => {
  const { withMetroConfig } = await import('react-native-monorepo-config');

  const root = path.resolve(__dirname, '..');
  const config = await getDefaultConfig(__dirname);

  return withMetroConfig(config, {
    root,
    dirname: __dirname,
  });
})();
