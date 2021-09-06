import React from "react";
import { View, Text } from 'react-native';

import { styles } from "./styles";

export function Header() {
  return (
    <View style={styles.header}>
      <Text style={styles.textHeader}>Passweird</Text>
    </View>
  );
}
